SUMMARY = "Snake base image"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

require console-image.bb

I2C_TOOLS = " \
    i2c-tools \
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
    qtlocation-dev \
    qtlocation-mkspecs \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtsensors-dev \
    qtsensors-mkspecs \
    qtserialbus-dev \
    qtserialbus-mkspecs \
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

SDR = " \
    libhackrf \
    rtl-sdr \
    asn1c \
    libfftwf \
    fftw-dev \
    qsweep-srv \
"

IMAGE_INSTALL += " \
    ${I2C_TOOLS} \
    ${QT_TOOLS} \
    ${QT_DEV_TOOLS} \
    ${QT5_PKGS} \
    ${QT5_DEV_PKGS} \
    ${OPENMP} \
    ${OPENMP_DEV} \
    ${MQTT} \
    ${MQTT_DEV} \
    ${SDR} \
"

export IMAGE_BASENAME = "snake-xu4-image"

