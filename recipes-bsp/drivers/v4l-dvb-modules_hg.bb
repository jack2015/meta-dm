SUMMARY = "V4L dvb modules for Dreambox"

SRCDATE = "20100904"
KV = "${KERNELVERSION}-7.4-${MACHINE}"
PV = "${KV}+${SRCDATE}"

SRC_URI = "file://v4l-dvb-modules_${KV}-${SRCDATE}.zip"

S = "${WORKDIR}/"

require v4l-dvb-modules.inc

COMPATIBLE_MACHINE = "^(dm800)$"
