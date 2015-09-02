/*
 * Copyright 2015 JBlade LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */



package org.redhelix.core.computer.system.power.supply;

/**
 *
 * <br><br>Git SHA: $Id$
 *
 * @since RedHelix Version 0.1
 * @author Hank Bruning
 *
 */
public enum RedHxPowerSupplyLineInputVoltageTypeEnum
{
    AC_HIGH_LINE("277V AC input"),
    AC_LOW_LINE("100-127V AC input"),
    AC_MID_LINE("200-240V AC input"),
    DC_480V("High Voltage DC input (380V)"),
    DC_NEG_48V("-48V DC input"),
    UNKNOWN("The power supply line input voltage type cannot be determined");

    private final String desc;

    private RedHxPowerSupplyLineInputVoltageTypeEnum( final String desc )
    {
        this.desc = desc;
    }

    public String getDescription( )
    {
        return desc;
    }
}
