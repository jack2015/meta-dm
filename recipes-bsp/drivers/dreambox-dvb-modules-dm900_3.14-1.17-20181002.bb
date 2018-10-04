KV = "3.14-1.17"
DRIVERDATE = "20181002"

require dreambox-dvb-modules-new.inc

SRC_URI[dm900.md5sum] = "acb3a9914e48e188a52d5ee1c6b345b0"
SRC_URI[dm900.sha256sum] = "55365e273e83150c254f0df7d907eb366a50eae6ee033c6d16dcca1e850e51a0"

COMPATIBLE_MACHINE = "dm900"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm900.md5sum', True)}"
