KV = "3.4-4.0"
DRIVERDATE = "20181002"

require dreambox-dvb-modules-new.inc

SRC_URI[dm820.md5sum] = "431d6811e809d096939483e2b6e65996"
SRC_URI[dm820.sha256sum] = "698456c777e14f527502c7a1a8b7bfbe292fbb470e8e0226911b6fd6b54fc417"

COMPATIBLE_MACHINE = "dm820"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm820.md5sum', True)}"
