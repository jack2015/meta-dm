KV = "3.14-1.17"
DRIVERDATE = "20180409"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm900.md5sum] = "7b0dd4d930315d365a67aa1419ac54ac"
SRC_URI[dm900.sha256sum] = "ef6e1c9bc17ef98124e1d45a20cb88c996b4d1525def7f4f236bd8745f0320be"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
