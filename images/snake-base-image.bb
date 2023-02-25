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

TSLIB = " \
    tslib \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

TSLIB_DEV = " \
    tslib-dev \
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
    qtcharts-dev \
    qtcharts-mkspecs \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtgraphicaleffects-dev \
    qtlocation-dev \
    qtlocation-mkspecs \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtsensors-dev \
    qtsensors-mkspecs \
    qtserialbus-dev \
    qtserialbus-mkspecs \
    qtsvg-dev \
    qtsvg-mkspecs \
    qtwebsockets-dev \
    qtwebsockets-mkspecs \
    qtvirtualkeyboard-dev \
    qtxmlpatterns-dev \
    qtxmlpatterns-mkspecs \
    qtserialport-dev \
    qtserialport-mkspecs \
    qtmqtt-dev \
    qtmqtt-mkspecs \
"
QT5_PKGS = " \
    qtcharts \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtlocation-plugins \
    qtmultimedia \
    qtquickcontrols2 \
    qtsensors-plugins \
    qtserialbus \
    qtsvg \
    qtwebsockets-qmlplugins \
    qtvirtualkeyboard \
    qtxmlpatterns \
    qtserialport \
    qtmqtt \
"

QT5_3D_PKGS = " \
    qt3d \
"

QT5_3D_DEV_PKGS = " \
    qt3d-dev \
    qt3d-mkspecs \
"

QT5_WEBENGINE_PKGS = " \
    qtwebengine \
"

QT5_DEV_WEBENGINE_PKGS = " \
    qtwebengine-dev \
    qtwebengine-mkspecs \
"

SDR = " \
    asn1c \
    libfftwf \
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
    python-paho-mqtt \
"

GPIO = " \
    wiringpi \
    bcm2835-dev \
"

IMAGE_INSTALL += " \
    ${TOOLS_INSTALL} \
    ${DEV_SDK_INSTALL} \
    ${I2C_TOOLS} \
    ${FONTS} \
    ${FONTS_DEV} \
    ${TSLIB} \
    ${TSLIB_DEV} \
    ${QT_TOOLS} \
    ${QT_DEV_TOOLS} \
    ${QT5_PKGS} \
    ${QT5_DEV_PKGS} \
    ${QT5_3D_PKGS} \
    ${QT5_3D_DEV_PKGS} \
    ${SDR} \
    ${OPENMP} \
    ${OPENMP_DEV} \
    ${MQTT} \
    ${MQTT_DEV} \
    ${GPIO} \
"

export IMAGE_BASENAME = "snake-base-image"

