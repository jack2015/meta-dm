KV = "3.14-1.17"
DRIVERDATE = "20181002"

require dreambox-dvb-modules-new.inc

SRC_URI[dm920.md5sum] = "979fda4563a4b07c4357a2a7cf5cc9f2"
SRC_URI[dm920.sha256sum] = "daf623511188760253471df4c4adb1197412e316f82a519e5fabda887ca45ddd"

COMPATIBLE_MACHINE = "dm920"

MD5SUM = "${@d.getVarFlag('SRC_URI', 'dm920.md5sum', True)}"
