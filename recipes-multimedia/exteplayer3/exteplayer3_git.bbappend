FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append += " \
	${@bb.utils.contains("MACHINE_FEATURES", "dreambox", "\
	file://swap-ioctl-for-h265-and-ddp.patch \
	", "", d)} \
"
