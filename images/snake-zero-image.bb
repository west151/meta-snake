SUMMARY = "Snake base image"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

require console-image.bb

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
    bluez5 \
    pi-bluetooth \
    wpa-supplicant \
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
    python-modules \
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

QT_TOOLS = " \
    qtbase \
    qtbase-plugins \
    qtbase-tools \
    qt5-env \
"

QT_DEV_TOOLS = " \
    qtbase-dev \
    qtbase-mkspecs \
"

QT5_DEV_PKGS = " \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtgraphicaleffects-dev \
    qtlocation-dev \
    qtlocation-mkspecs \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtsensors-dev \
    qtsensors-mkspecs \
    qtserialbus-dev \
    qtserialbus-mkspecs \
    qtsvg-dev \
    qtsvg-mkspecs \
    qtwebsockets-dev \
    qtwebsockets-mkspecs \
    qtxmlpatterns-dev \
    qtxmlpatterns-mkspecs \
    qtserialport-dev \
    qtserialport-mkspecs \
    qtmqtt-dev \
    qtmqtt-mkspecs \
"
QT5_PKGS = " \
    qtgraphicaleffects \
    qtlocation-plugins \
    qtmultimedia \
    qtsensors-plugins \
    qtserialbus \
    qtsvg \
    qtwebsockets-qmlplugins \
    qtxmlpatterns \
    qtserialport \
    qtmqtt \
"

MQTT = " \
    libmosquitto1 \
    libmosquittopp1 \
    mosquitto \
    mosquitto-clients \
"

MQTT_DEV = " \
    mosquitto-dev \
    python-paho-mqtt \
"

GPIO = " \
    bcm2835-dev \
    rpi-gpio \
    rpio \
"

IMAGE_INSTALL += " \
    ${TOOLS_INSTALL} \
    ${DEV_SDK_INSTALL} \
    ${I2C_TOOLS} \
    ${FONTS} \
    ${FONTS_DEV} \
    ${QT_TOOLS} \
    ${QT_DEV_TOOLS} \
    ${QT5_PKGS} \
    ${QT5_DEV_PKGS} \
    ${MQTT} \
    ${MQTT_DEV} \
    ${GPIO} \
"

export IMAGE_BASENAME = "snake-zero-image"

