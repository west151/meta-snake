SUMMARY = "A console Snake pi4 image"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "en-us ru-ru"

MODULES_FILES = " \
    modules-files \
    script-files \
"

CORE_OS = " \
    openssh \
    openssh-keygen \
    openssh-sftp-server \
    tzdata \
"

TOOLS_MULTIMEDIA = " \
    ffmpeg \
    opencv \
    opencv-samples \
    v4l-utils \
"

TOOLS_INSTALL = " \
    bzip2 \
    devmem2 \
    dosfstools \
    ethtool \
    fbset \
    findutils \
    iproute2 \
    less \
    memtester \
    netcat \
    procps \
    rsync \
    sysfsutils \
    unzip \
    util-linux \
    zip \
    e2fsprogs-resize2fs \
    nano \
    mc \
    htop \
    tcpdump \
    usbutils \
    pi-bluetooth \
    pciutils \
"

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

I2C_TOOLS = " \
    i2c-tools \
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

SDR = " \
    asn1c \
    libfftwf \
    fftw-dev \
    libhackrf \
    rtl-sdr \
"

GPS = " \
    pps-tools \
"

AIRNET = " \
    crda \
    iw \
    linux-firmware-rpidistro-bcm43430 \
    linux-firmware-rpidistro-bcm43455 \
    wpa-supplicant \
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

QT6_PKGS = " \
    qtbase \
    qtserialbus \
    qtserialport \
    qtmqtt \
    qtwebsockets \
    qtcoap \
    qtnetworkauth \
    qt3d \
    qtdeclarative \
    qtvirtualkeyboard \
    qtcharts \
    qtsvg \
    qtimageformats \
    qtwayland \
    qttranslations \
    qtcharts \
    qtquick3d \
    qtquicktimeline \
"

IMAGE_INSTALL += " \
    kernel-modules \
    ${CORE_OS} \
    ${TOOLS_INSTALL} \
    ${DEV_SDK_INSTALL} \
    ${I2C_TOOLS} \
    ${FONTS} \
    ${FONTS_DEV} \
    ${TSLIB} \
    ${TSLIB_DEV} \
    ${SDR} \
    ${GPS} \
    ${AIRNET} \
    ${OPENMP} \
    ${OPENMP_DEV} \
    ${MQTT} \
    ${MQTT_DEV} \
    ${QT6_PKGS} \
    ${MODULES_FILES} \
"

disable_bootlogd() {
    echo BOOTLOGD_ENABLE=no > ${IMAGE_ROOTFS}/etc/default/bootlogd
}

ROOTFS_POSTPROCESS_COMMAND += " \
    disable_bootlogd ; \
 "

export IMAGE_BASENAME = "console-image"
