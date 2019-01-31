FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PYTHON_RDEPS += "\
	python-service-identity \
"

SRC_URI_append_dm800 += "\
    file://e2_old_dvbapi.patch \
"

SRC_URI_append_dm900 += "\
    file://adapt-res-to-dm9x0-display.patch \
"

SRC_URI_append_dm920 += "\
    file://adapt-res-to-dm9x0-display.patch \
"
