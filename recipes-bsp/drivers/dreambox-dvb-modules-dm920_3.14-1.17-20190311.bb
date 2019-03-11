KV = "3.14-1.17"
DRIVERDATE = "20190311"

require dreambox-dvb-modules-new.inc

SRC_URI[dm920.md5sum] = "58d3337bb1f784b9ab6b645c5e2be258"
SRC_URI[dm920.sha256sum] = "f337e6043b14e055ac3f08424a848300100424f3d2ebadb3446519727d32611c"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
