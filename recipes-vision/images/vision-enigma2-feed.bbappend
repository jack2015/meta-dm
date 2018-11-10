OPTIONAL_PACKAGES_remove_dm800 += "\
	lirc \
	iptraf \
	"

OPTIONAL_PACKAGES_remove_dm900 += "\
	rtl8192cu \
	"

OPTIONAL_PACKAGES_remove_dm920 += "\
	rtl8192cu \
	"

OPTIONAL_PACKAGES_remove += "\
			${@bb.utils.contains_any('MACHINE', '\
			dm500hd \
			dm500hdv2 \
			dm800se \
			dm800sev2 \
			dm7020hd \
			dm7020hdv2 \
			', ' \
			rtl8189es \
			', '', d)} \
			"
