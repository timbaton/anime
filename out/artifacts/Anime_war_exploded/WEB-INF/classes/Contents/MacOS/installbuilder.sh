#!/bin/sh
os_version=`uname -r`
machine_platform=`uname -p`
EXTRACT_MODE=0

_process_command_line() {
  case ${1} in
  --extract-only)
     EXTRACT_MODE=1
     ;;
  *)
    ;;
  esac
}

ARGLIST=$@
for opt in ${ARGLIST}
do
  _process_command_line ${opt}
done

if [ "${os_version:0:1}" == "6" ];then
    executable="osx-10.2"
elif [ "${machine_platform}" == "i386" ];then
    executable="osx-intel"
else
    executable="osx-ppc"
fi

if [ "${1}" == --help -o $EXTRACT_MODE -eq 1 ];then
    "`dirname \"${0}\"`/$executable" "$@"
else
    "`dirname \"${0}\"`/PostgreSQL" $executable "$@" --require-admin 1
fi
