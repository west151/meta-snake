# Customization of init-ifupdown

# Files directory
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

# Sources
SRC_URI:append = " \
    file://interfaces \
"

# Install a new file interfaces file if we want to connect 
do_install:append() {
	install -m 0644 ${S}/interfaces ${D}${sysconfdir}/network
}
