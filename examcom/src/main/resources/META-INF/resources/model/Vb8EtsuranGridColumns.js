/**
 * VIEWグリッド定義
 */

let Vb8EtsuranGridColumns = [];

$(function() {
    Vb8EtsuranGridColumns = [
        Column.text('henkan_moto_id', Messages['Vb8EtsuranGrid.henkanMotoId'], 80, '', null),
        Column.text('henkan_moto_info', Messages['Vb8EtsuranGrid.henkanMotoInfo'], 300, '', null),
        Column.text('hikitsuida_info', Messages['Vb8EtsuranGrid.hikitsuidaInfo'], 300, '', null),
    ];
});
