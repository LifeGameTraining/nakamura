(ns lifegame.core
  (:gen-class))

(def greet-word "ゲームを始めます！！")

(defn greet [word]
  (println word))

(defn -main []
  (greet greet-word))