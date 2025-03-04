/**
 * VIEWグリッド定義
 */

let Vb9EtsuranGridColumns = [];

$(function() {
    Vb9EtsuranGridColumns = [
        Column.text('henkan_moto_id', Messages['Vb9EtsuranGrid.henkanMotoId'], 80, '', null),
        Column.text('henkan_moto_info', Messages['Vb9EtsuranGrid.henkanMotoInfo'], 300, '', null),
        Column.text('hikitsuida_info', Messages['Vb9EtsuranGrid.hikitsuidaInfo'], 300, '', null),
    ];
});
