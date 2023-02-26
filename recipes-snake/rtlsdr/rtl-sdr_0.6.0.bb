SUMMARY = "Software to turn the RTL2832U into a SDR"
HOMEPAGE = "http://sdr.osmocom.org/trac/wiki/rtl-sdr"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "libusb1"

SRC_URI = "https://gitea.osmocom.org/sdr/rtl-sdr/archive/${PV}.tar.gz"
SRC_URI[sha256sum] = "453b1be3b7a423a18dc5c8f9d4cb3b2d1c61c8734ebd7fe055caabe0c6451d1d"

S = "${WORKDIR}/rtl-sdr"

inherit cmake pkgconfig lib_package

do_install:append() {
	install -d ${D}${sysconfdir}/udev/rules.d
	install -m 0644 ${S}/rtl-sdr.rules ${D}${sysconfdir}/udev/rules.d
}
