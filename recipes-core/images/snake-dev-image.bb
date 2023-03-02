SUMMARY = "Snake image for cm4 io board"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

require mini-image.bb

DEV_SDK_INSTALL = " \
    binutils \
    binutils-symlinks \
    coreutils \
    cpp \
    cpp-symlinks \
    diffutils \
    file \
    g++ \
    g++-symlinks \
    gcc \
    gcc-symlinks \
    gdb \
    gdbserver \
    gettext \
    ldd \
    libstdc++ \
    libstdc++-dev \
    libtool \
    make \
    perl-modules \
    pkgconfig \
"

OPENMP = " \
    libgomp \
"

OPENMP_DEV = " \
    libgomp-dev \
    libgomp-staticdev \
"

MQTT = " \
    libmosquitto1 \
    libmosquittopp1 \
    mosquitto \
    mosquitto-clients \
"

MQTT_DEV = " \
    mosquitto-dev \
"

FONTS = " \
    fontconfig \
    fontconfig-utils \
    ttf-bitstream-vera \
"

FONTS_DEV = " \
    fontconfig-dev \
"

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

TSLIB_DEV = " \
    tslib-dev \
"

IMAGE_INSTALL += " \
    ${DEV_SDK_INSTALL} \
    ${OPENMP} \
    ${OPENMP_DEV} \
    ${MQTT} \
    ${MQTT_DEV} \
    ${FONTS} \
    ${FONTS_DEV} \
    ${TSLIB} \
    ${TSLIB_DEV} \
"

export IMAGE_BASENAME = "snake-dev-image"
