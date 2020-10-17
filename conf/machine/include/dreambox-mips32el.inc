# dreambox-mips32el.inc

BOX_BRAND = "dreambox"

TARGET_ARCH = "mipsel"
DEFAULTTUNE = "mips32el"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	libpagecache \
	libpassthrough \
	"

MTD_KERNEL = "mtd2"

require conf/machine/include/dreambox.inc
require conf/machine/include/tune-mips32.inc

DVBMEDIASINK_CONFIG = "--with-pcm --with-wma --with-wmv --with-dtsdownmix --with-eac3 --with-dts"
