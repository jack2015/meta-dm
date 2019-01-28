FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PYTHON_RDEPS += "\
	python-service-identity \
"

SRC_URI_append_dm800 += "\
    file://e2_old_dvbapi.patch \
"

SRC_URI_append_dm900 += "\
    file://add-skin_display-dm9x0.patch \
    file://adapt-res-to-dm9x0-display.patch \
    file://revert-hide-tuner-menu-items-when-no-nims-are-select.patch \
"

SRC_URI_append_dm920 += "\
    file://add-skin_display-dm9x0.patch \
    file://adapt-res-to-dm9x0-display.patch \
    file://revert-hide-tuner-menu-items-when-no-nims-are-select.patch \
"

SRC_URI_append_dm820 += "\
    file://revert-hide-tuner-menu-items-when-no-nims-are-select.patch \
"
