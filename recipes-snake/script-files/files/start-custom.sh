#!/bin/sh

# Adding a DS3231 Real Time Clock To The Raspberry Pi
echo ds1307 0x68 > /sys/class/i2c-adapter/i2c-1/new_device
hwclock -s
