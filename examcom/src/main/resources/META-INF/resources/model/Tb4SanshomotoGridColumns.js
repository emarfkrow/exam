/**
 * 参照元グリッド定義
 */

let Tb4SanshomotoGridColumns = [];

$(function() {
    Tb4SanshomotoGridColumns = [
        Column.comma('SANSHOMOTO_ID', Messages['Tb4SanshomotoGrid.sanshomotoId'], 80, 'primaryKey numbering', null),
        Column.refer('IDSANSHO_ID', Messages['Tb4SanshomotoGrid.idsanshoId'], 80, '', 'IDSANSHO_MEI'),
        Column.text('IDSANSHO_MEI', Messages['Tb4SanshomotoGrid.idsanshoMei'], 300, '', null),
        Column.refer('CDSANSHO_CD', Messages['Tb4SanshomotoGrid.cdsanshoCd'], 80, '', 'CDSANSHO_MEI'),
        Column.text('CDSANSHO_MEI', Messages['Tb4SanshomotoGrid.cdsanshoMei'], 300, '', null),
        Column.refer('NOSANSHO_NO', Messages['Tb4SanshomotoGrid.nosanshoNo'], 80, '', 'NOSANSHO_MEI'),
        Column.text('NOSANSHO_MEI', Messages['Tb4SanshomotoGrid.nosanshoMei'], 300, '', null),
        Column.refer('BETSU_IDSANSHO_ID', Messages['Tb4SanshomotoGrid.betsuIdsanshoId'], 80, '', 'BETSU_IDSANSHO_MEI'),
        Column.cell('UPDATE_TS', Messages['Tb4SanshomotoGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb4SanshomotoGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb4SanshomotoGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
