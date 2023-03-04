SUMMARY = "Add file modules to /etc"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://modules"

PR = "r1"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/
    install -m 0666 modules ${D}${sysconfdir}/
}

FILES_${PN} = "${sysconfdir}"

