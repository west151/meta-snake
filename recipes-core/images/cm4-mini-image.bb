SUMMARY = "cm4 mini image"
HOMEPAGE = "gis1501@gmail.com"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += "package-management"
IMAGE_LINGUAS = "en-us ru-ru"

CORE_OS = " \
    openssh \
    openssh-keygen \
    openssh-sftp-server \
    tzdata \
"

DOCKER_TOOLS = " \
    docker-ce \
    python3-docker-compose \
    python3-distutils \
"

TOOLS_OS = " \
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
    i2c-tools \
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

IMAGE_INSTALL += " \
    ${CORE_OS} \
    ${TOOLS_OS} \
    ${DEV_SDK_INSTALL} \
    ${DOCKER_TOOLS} \
"

export IMAGE_BASENAME = "cm4-mini-image"
