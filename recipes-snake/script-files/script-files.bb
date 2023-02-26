SUMMARY = "Add startup scripts"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
          file://startup.sh \
          file://start-custom.sh \
          file://stop-custom.sh \
          "

INITSCRIPT_NAME = "startup.sh"
INITSCRIPT_PARAMS = "start 99 5 2 . stop 20 0 1 6 ."

inherit update-rc.d

PR = "r1"

S = "${WORKDIR}"

do_install() {
    # startup.sh
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${INITSCRIPT_NAME} ${D}${sysconfdir}/init.d
    # start/stop scripts
    install -d ${D}${sbindir}
    install -m 0755 start-custom.sh ${D}${sbindir}
    install -m 0755 stop-custom.sh ${D}${sbindir}
}

FILES_${PN} = " \
              ${sysconfdir} \
              ${sbindir} \
              "
