# PMC Android Toolbox

A companion library containing common tools for Android development like: validations, MVVM architecture, and more.


## Tools Included

* __Validators__. Powered by [ValidateTor](https://github.com/nisrulz/validatetor)

    * `DOBValidator` - Validates Date of Birth Format
    * `EmailValidator` - Validates Email Format
    * `MemberIdValidator` - Validates MemberId Format
    * `NameValidator` - Validates Name Format
    * `PasswordValidator` - Validates Password Format

* __Converters__.

    * `DisplayUnitConverter` - Px, Dp. Powered by [Android Units](https://github.com/kevelbreh/androidunits)
    * `LengthConverter` - Inch, Feet, Cm
    * `WeightConverter` - Lb, Kg

* __Checkers__.

    * `InternetChecker` - Checks if there's an internet connection

* __LiveData Tools__.

    * `Event` - From [Here](https://github.com/google/iosched/blob/master/shared/src/main/java/com/google/samples/apps/iosched/shared/result/Event.kt)
    * `NonNullObservableField` - From [Here](https://medium.com/meesho-tech/non-null-observablefield-in-kotlin-bd72d31ab54f)
    
* __Date Tools__.
    
    * `DateTimeHelper` - Get current date time in UTC and local timezone
    * `DateTimeExtension` - Date time timezone converter (e.g UTC to GMT+8, etc)


## License

```
Copyright 2019 Paul Mark Castillo

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```