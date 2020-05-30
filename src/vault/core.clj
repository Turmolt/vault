(ns vault.core
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]))

(def vault (when-let [file (io/file ".vault")] 
             (when (.exists file) (edn/read-string (slurp file)))))