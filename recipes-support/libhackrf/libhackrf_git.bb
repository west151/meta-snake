SUMMARY = "Libhackrf"
HOMEPAGE = "https://github.com/mossmann/hackrf/wiki"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://../COPYING;md5=1484b9683e3fc1dd9f5cf802a23fe67c"

DEPENDS += "libusb fftwf"

inherit cmake pkgconfig

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/mossmann/hackrf.git;branch=master"

S = "${WORKDIR}/git/host"

