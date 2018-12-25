IMAGE_INSTALL_remove += "\
	${@bb.utils.contains("MACHINE_FEATURES", "dreambox", "\
	ofgwrite \
	", "", d)} \
	"
