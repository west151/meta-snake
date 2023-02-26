SUMMARY = "Libhackrf"
HOMEPAGE = "https://github.com/mossmann/hackrf/wiki"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://../COPYING;md5=1484b9683e3fc1dd9f5cf802a23fe67c"

DEPENDS = "libusb fftwf"

# Didn't find any version information in the sources
#PV = "0.0.2"

inherit cmake pkgconfig

SRC_URI = "git://github.com/mossmann/hackrf.git;branch=master;protocol=https \
          "
S = "${WORKDIR}/git/host"

#SRCREV = "${AUTOREV}"
SRCREV = "509c8f4c91a156420d137b28965d21ef40e6142d"
