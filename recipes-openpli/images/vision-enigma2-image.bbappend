IMAGE_INSTALL_remove += "\
	${@bb.utils.contains("MACHINE_FEATURES", "dreambox", "\
	ofgwrite \
	", "", d)} \
	"

IMAGE_INSTALL_remove_dm500hd += "\
	samba-base \
	"

IMAGE_INSTALL_remove_dm800 += "\
	samba-base \
	"

IMAGE_INSTALL_remove_dm800se += "\
	samba-base \
	"
