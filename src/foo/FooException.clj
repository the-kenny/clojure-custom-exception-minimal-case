(ns foo.FooException
  (:gen-class
   :constructors {[] []}
   :init init))

(defn -init []
  [[] {}])

(defn -toString
  [this]
  "Hello, World!")

