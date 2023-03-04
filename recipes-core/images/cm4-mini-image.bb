SUMMARY = "cm4 image"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "en-us ru-ru"

MODULES_FILES = " \
    modules-files \
"

CORE_OS = " \
    openssh \
    openssh-keygen \
    openssh-sftp-server \
    tzdata \
"

IMAGE_INSTALL += " \
    kernel-modules \
    ${CORE_OS} \
    ${MODULES_FILES} \
"

disable_bootlogd() {
    echo BOOTLOGD_ENABLE=no > ${IMAGE_ROOTFS}/etc/default/bootlogd
}

ROOTFS_POSTPROCESS_COMMAND += " \
    disable_bootlogd ; \
 "

export IMAGE_BASENAME = "cm4-mini-image"
