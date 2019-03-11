KV = "3.14-1.17"
DRIVERDATE = "20190311"

require dreambox-dvb-modules-new.inc

SRC_URI[dm900.md5sum] = "494f741ad2dafb0abd0bdf4ac45e564c"
SRC_URI[dm900.sha256sum] = "e6c90fa9e8e4f3e9c0dd5e1afbfafc7d70891596a8b64fcf3b79624d8c9d7d1c"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
