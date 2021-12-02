OPENDREAMBOX_PROJECT ?= "${BPN}"

DMBRANCH ?= "master"

SRC_URI += "git://git.opendreambox.org/git/${OPENDREAMBOX_PROJECT}.git;protocol=git;branch=${DMBRANCH}"

inherit git-project

COMPATIBLE_MACHINE = "^(dm500hd|dm800se|dm800)$"
