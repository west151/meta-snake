SUMMARY = "A asn1n library"
DESCRIPTION = "ASN.1 to C compiler takes the ASN.1 module files (example) \
 and generates the C++ compatible C source code."
HOMEPAGE = "http://lionet.info/"
SECTION = "libs"

LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5d4cc9194e85f993b26ee3b8ad5b280d"

SRCREV="d6a741287bab0f9025a4cd1cf92fd796e4a58e36"
SRC_URI = "git://github.com/vlm/asn1c.git"

inherit autotools pkgconfig

S = "${WORKDIR}/git"

RDEPENDS_${PN}-dev = ""
