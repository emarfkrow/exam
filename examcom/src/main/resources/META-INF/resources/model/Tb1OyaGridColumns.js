/**
 * 親グリッド定義
 */

let Tb1OyaGridColumns = [
    Column.comma('SOSEN_ID', Messages['Tb1OyaGrid.sosenId'], 80, 'primaryKey numbering', null),
    Column.comma('OYA_BN', Messages['Tb1OyaGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.text('OYA_MEI', Messages['Tb1OyaGrid.oyaMei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Tb1OyaGrid.deleteF'], 30, ''),
    Column.select('STATUS_KB', Messages['Tb1OyaGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
];
