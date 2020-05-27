# vault

The simplest secret management system available for clojure

## Usage

Create a `.vault` file in the project directory containing a map of the keys you wish to store.

```
{:token "lksj19sndox91kntilamxk"
 :url   "https://gates.dev"}
```

Add `[vault.core :refer [vault]]` to your requirements and then query for your keys!

```
(def token (vault :token))
```

Make sure to exclude the `.vault` file from your version control if you want to keep them secure

## License

Copyright © 2020 Sam Gates

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
