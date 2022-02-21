require conf/license/license-gplv2.inc

SRC_URI = "file://dm-shutdown.sh"

inherit update-rc.d

INITSCRIPT_NAME = "dm-shutdown"
INITSCRIPT_PARAMS = "start 39 0 ."

do_compile() {
}

do_install() {
	install -d ${D}${INIT_D_DIR}/
	install -m 0755 ${WORKDIR}/dm-shutdown.sh ${D}${INIT_D_DIR}/dm-shutdown
}
