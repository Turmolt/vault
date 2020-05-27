(ns vault.core
  (:require [clojure.edn :as edn]))

(def vault (edn/read-string (slurp ".vault")))