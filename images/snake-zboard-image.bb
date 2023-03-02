SUMMARY = "Snake for Raspberry Pi Zero"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

require snake-zero-image.bb

MODULES_FILES = " \
    modules-files \
    script-files \
"

IMAGE_INSTALL += " \
    ${MODULES_FILES} \
"

export IMAGE_BASENAME = "snake-zboard-image"

