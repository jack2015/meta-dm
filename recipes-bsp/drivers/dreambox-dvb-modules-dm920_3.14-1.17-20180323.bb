KV = "3.14-1.17"
DRIVERDATE = "20180323"

require dreambox-dvb-modules-new.inc

PR = "${INC_PR}.0"

SRC_URI[dm920.md5sum] = "3c03f42420545051c9964ed8a2221e23"
SRC_URI[dm920.sha256sum] = "1d35004af9dffc4bce5b9181d5d1a34fef2f69dbc12361459eaca8af09413167"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
