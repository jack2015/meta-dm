SUMMARY = "Display progress bar while booting"
SECTION = "base"
PRIORITY = "optional"

require conf/license/openvision-gplv2.inc

SRC_URI = "file://progress"

S = "${WORKDIR}"

do_install () {
#
# Create directories and install device independent scripts
#
	install -d ${D}${INIT_D_DIR}
	install -d ${D}${sysconfdir}/rcS.d
	install -m 0755 ${WORKDIR}/progress ${D}${INIT_D_DIR}
#
# Create runlevel links
#
	ln -sf ../init.d/progress ${D}${sysconfdir}/rcS.d/S06progress
	ln -sf ../init.d/progress ${D}${sysconfdir}/rcS.d/S10progress
	ln -sf ../init.d/progress ${D}${sysconfdir}/rcS.d/S20progress
	ln -sf ../init.d/progress ${D}${sysconfdir}/rcS.d/S30progress
	ln -sf ../init.d/progress ${D}${sysconfdir}/rcS.d/S40progress
	ln -sf ../init.d/progress ${D}${sysconfdir}/rcS.d/S50progress
}

do_compile[noexec] = "1"
