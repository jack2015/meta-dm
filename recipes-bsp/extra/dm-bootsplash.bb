SUMMARY = "Dreambox boot splash screen"
SECTION = "base"
PRIORITY = "required"
PACKAGE_ARCH = "${MACHINE_ARCH}"
LICENSE = "CLOSED"

COMPATIBLE_MACHINE = "^(dm500hd|dm800|dm800se)$"

BINARY_VERSION = "1.3"
PV = "${BINARY_VERSION}"

S = "${WORKDIR}"

SRC_URI = "http://dreamboxupdate.com/download/opendreambox/2.0.0/dreambox-bootlogo/dreambox-bootlogo_${BINARY_VERSION}_${MACHINE}.tar.bz2;name=${MACHINE}"

SRC_URI_append = " file://ov.jpg"

SRC_URI[dm500hd.md5sum] = "b9ada70304ca1f9a8e36a55bd38834c6"
SRC_URI[dm500hd.sha256sum] = "d4b0f650711d5d6fdecb42efe9e13987ef803cba829d0950e899608a784ae3b2"
SRC_URI[dm800.md5sum] = "0aacd07cc4d19b388c6441b007e3525a"
SRC_URI[dm800.sha256sum] = "978a7c50fd0c963013477b5ba08462b35597ea130ae428c828bfcbb5c7cf4cac"
SRC_URI[dm800se.md5sum] = "3413a894a3d77e02cae34b96d302817d"
SRC_URI[dm800se.sha256sum] = "8a283442c231e82ee1a2093e53dc5bf52c478e12d22c79af7e7026b52711fc9c"

do_install() {
	install -d ${D}/boot
	install -m 0755 ${S}/dreambox-bootlogo_${BINARY_VERSION}_${MACHINE}/bootlogo-${MACHINE}.elf.gz ${D}/boot/
	install -m 0755 ${S}/ov.jpg ${D}/boot/bootlogo-${MACHINE}.jpg
}

inherit deploy

pkg_postinst_${PN}() {
	if [ -z "$D" ]
	then
		umount /boot
	fi
}

pkg_prerm_${PN}() {
	if [ -z "$D" ]
	then
		if mountpoint -q /boot
		then
			mount -o remount,rw,compr=none /boot
		else
			mount -t jffs2 -o rw,compr=none mtd:boot /boot
		fi
	fi
}

pkg_postrm_${PN}() {
	if [ -z "$D" ]
	then
		umount /boot
	fi
}

FILES_${PN} = "/boot"
