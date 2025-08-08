/**
 * VIEWグリッド定義
 */

let NewEntity1GridColumns = [];

$(function() {
    NewEntity1GridColumns = [
        Column.text('SRC_ID', Messages['NewEntity1Grid.srcId'], 90, '', null),
        Column.text('DEST_INFO', Messages['NewEntity1Grid.destInfo'], 300, '', null),
    ];
});
