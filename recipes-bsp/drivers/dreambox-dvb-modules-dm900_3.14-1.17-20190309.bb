KV = "3.14-1.17"
DRIVERDATE = "20190309"

require dreambox-dvb-modules-new.inc

SRC_URI[dm900.md5sum] = "85b346c0d41e5f128ba734202cd05e5a"
SRC_URI[dm900.sha256sum] = "fa0aa8005cf8ec1ed4fa34e15ccef1b81eb09c10188281a4a837296d8c9a6870"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
