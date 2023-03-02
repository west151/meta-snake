#!/bin/sh
### BEGIN INIT INFO
# Provides:             startup.sh
# Required-Start:       $all
# Required-Stop:        $all
# Default-Start:        2 3 4 5
# Default-Stop:         0 1 6
# Short-Description: Start/stop processes required for startup.sh
### END INIT INFO

case "$1" in

'start')
   /usr/sbin/start-custom.sh &
   ;;
'stop')
   /usr/sbin/stop-custom.sh &
   ;;
*)
   echo "Usage: /etc/init.d/startup.sh { start | stop }"
   ;;
esac
