SUMMARY = "qsweep-server" 
HOMEPAGE = "gis1501@gmail.com" 
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCREV = "${AUTOREV}"
SRC_URI = "git://github.com/west151/qsweep-server.git;protocol=https;branch=main"

DEPENDS += "qtbase qtmqtt fftwf libhackrf"

PR = "r0"

inherit qt6-cmake

S = "${WORKDIR}/git"
