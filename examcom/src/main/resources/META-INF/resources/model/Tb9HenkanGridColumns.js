/**
 * VIEWグリッド定義
 */

let Tb9HenkanGridColumns = [];

$(function() {
    Tb9HenkanGridColumns = [
        Column.text('src_id', Messages['Tb9HenkanGrid.srcId'], 90, '', null),
        Column.text('dest_info', Messages['Tb9HenkanGrid.destInfo'], 300, '', null),
    ];
});
