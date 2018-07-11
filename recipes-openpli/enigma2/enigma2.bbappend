FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PYTHON_RDEPS += " \
	python-service-identity \
"

SRC_URI_append_dm800 += " \
    file://e2_old_dvbapi.patch \
    file://fix-wrong-driver-date.patch \
"

SRC_URI_append += " \
	${@bb.utils.contains("MACHINE_FEATURES", "dreambox", "\
	file://use-ioctl-22-for-h265.patch \
	file://fix-fp-version.patch \
	file://dual-tuner-letter-detection.patch \
	", "", d)} \
"

SRC_URI_append_dm900 += " \
    file://add-skin_display-dm9x0.patch \
    file://dm9x0-recoverymode.patch \
    file://add-support-2160p.patch \
    file://make-front-led-configurable.patch \
    file://adapt-res-to-dm9x0-display.patch \
    file://move-lcd-text-a-bit-to-the-right.patch \
    file://fix-framebuffer-and-use-ion-to-allocate-accel-memory.patch \
    file://revert-hide-tuner-menu-items-when-no-nims-are-select.patch \
"

SRC_URI_append_dm920 += " \
    file://add-skin_display-dm9x0.patch \
    file://dm9x0-recoverymode.patch \
    file://add-support-2160p.patch \
    file://make-front-led-configurable.patch \
    file://adapt-res-to-dm9x0-display.patch \
    file://move-lcd-text-a-bit-to-the-right.patch \
    file://fix-framebuffer-and-use-ion-to-allocate-accel-memory.patch \
    file://revert-hide-tuner-menu-items-when-no-nims-are-select.patch \
"

SRC_URI_append_dm820 += " \
    file://revert-hide-tuner-menu-items-when-no-nims-are-select.patch \
"

SRC_URI_append_dm8000 += " \
    file://fix-wrong-driver-date.patch \
"
