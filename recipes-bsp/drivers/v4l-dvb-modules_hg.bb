SUMMARY = "V4L dvb modules for Dreambox"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRCDATE = "20100904"
KV = "${KERNELVERSION}-7.4-${MACHINE}"
PV = "${KV}+${SRCDATE}"

SRC_URI = "file://v4l-dvb-modules_${KV}-${SRCDATE}.zip"

S = "${WORKDIR}/"

require v4l-dvb-modules.inc
